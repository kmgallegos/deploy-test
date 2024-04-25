package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.Type_ServiceDTO;
import pe.edu.upc.helpyou.entities.Type_Service;
import pe.edu.upc.helpyou.servicesinterfaces.IType_ServiceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/type services")
public class Type_ServiceController {
    @Autowired
    private IType_ServiceService tS;

    @PostMapping
    public void registrar(@RequestBody Type_ServiceDTO t)
    {
        ModelMapper m= new ModelMapper();
        Type_Service ca =m.map(t, Type_Service.class);
        tS.insert(ca);
    }

    @GetMapping
    public List<Type_ServiceDTO> list(){

        return tS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Type_ServiceDTO.class);
        }).collect(Collectors.toList());
    }
}
