package by.epam.main.repository.imp;

import by.epam.main.entity.Triangle;
import by.epam.main.repository.Specification;

public class IdSpecification implements Specification {
    private Long id;


public IdSpecification(Long id) {

    this.id = id;
}
    @Override
    public boolean specify (Triangle triangle){

    return triangle.getId().equals(id);
    }
}
