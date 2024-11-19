 package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

@Service
 public class Userservice {

    @Autowired
    private UserRepository userRepository;

    public UserModel insertUser(UserModel user){
        userRepository.save(user);
        return user;
    }

    public List<UserModel> getAllUsers(){
        return userRepository.findAll();
    }
//busca de um usuario e coloca numa caixa e pega pelo if
    public UserModel findById(Long id){
        Optional<UserModel> resultUser = userRepository.findById(id);

        if (resultUser.isPresent()) {
            return resultUser.get();
        }
        return null;
    }
//faz uma busca antes de deletar 
    public void deleteById(Long id) throws Exception{
        if(findById(id) != null){
            userRepository.deleteAllById(id);
        }else{
        throw new Exception("user with id " +id+ "not found");
        }
    }
//busca pelo nome, verifica se não é nulo e atualisa e retorna
    public UserModel updateById(Long id, String name) throws Exception{
        UserModel userReult = getById(id);

        if(userReult != null){
            userReult.setName(name);
            userRepository.save(userReult);
            return userReult;
        }

        throw new Exception("User with id "+ id+ "not found");
    }
}