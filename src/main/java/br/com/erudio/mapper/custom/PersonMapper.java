package br.com.erudio.mapper.custom;

import br.com.erudio.data.vo.v2.PersonVOV2;
import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {
    public PersonVOV2 convertEntityToVO(Person person){
        PersonVOV2 voV2 = new PersonVOV2();
        voV2.setId(person.getId());
        voV2.setFirstName(person.getFirstName());
        voV2.setLastName(person.getLastName());
        voV2.setAddress(person.getAddress());
        voV2.setGender(person.getGender());
        voV2.setBirthDay(new Date());

        return voV2;
    }

    public Person convertVOToEntity(PersonVOV2 person){
        Person entity = new Person();

        entity.setId(person.getId());
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());


        return entity;
    }
}
