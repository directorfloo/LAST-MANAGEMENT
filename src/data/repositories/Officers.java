package data.repositories;

import data.models.Officer;

import java.util.ArrayList;
import java.util.List;

public class Officers implements OfficerRepository {
    private static List<Officer> officers = new ArrayList<>();
    private int count;

    @Override
    public Officer save(Officer officer) {
        if (officer.getId() == 0) {
            generated();
            officer.setId(count);
            officers.add(officer);
        };
        return officer;
    }

    private void generated() {
        count++;
    }


    @Override
    public Officer findById(int id) {
       for (Officer officer : officers) {
           if (officer.getId() == id) {
               return officer;
           }
       }
        throw new IllegalArgumentException("Vehicle with id " + id + " not found");
    }


    @Override
    public List<Officer> findAll() {
        return  officers;
    }


    @Override
    public void deleteById(int id) {
        for(Officer officer : officers) {
            if(officer.getId() == id) {
                officers.remove(officer);
                break;
            }
        }
    }


    @Override
    public void deleteAll() {
        officers.clear();

    }


    @Override
    public void delete(Officer officer) {
        officers.remove(officer);

    }

    @Override
    public Officer findByEmail(String email) {
        for (Officer officer : officers) {
            if (officer.getEmail().equals(email)) {
                return officer;
            }
        }
        return null;
    }


    @Override
    public long count() {
        return officers.size();
    }
}
