package com.ditosoft.exercise.controllers;

import com.ditosoft.exercise.dtos.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FunctionsController {

    List<Operation> operations = new ArrayList<Operation>();



    @GetMapping("/test")
    public String test(){
        return "Hola Coca-Cola";
    }

    private Double multiply(Double factor01, Double factor02){
        // TODO
    }

    private Double divide(Double dividendo, Double divisor){
        //TODO
    }

    private Double add(Double sumando01, Double sumando02){
        //TODO
    }

    private Double subtract(Double minuendo, Double sustraendo){
        //TODO
    }

    private void addOperation(Operation operation){
        //TODO
    }

    private void cleanOperations(){

    }

    private List<Operation> getOperations(){
        //TODO
    }


}
