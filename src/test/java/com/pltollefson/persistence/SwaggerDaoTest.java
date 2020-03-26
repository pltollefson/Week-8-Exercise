package com.pltollefson.persistence;

import com.petstore.swagger.Category;
import com.petstore.swagger.TagsItem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SwaggerDaoTest {
    
    @Test
    void getPetById() {
        SwaggerDao dao = new SwaggerDao();
        assertEquals("doggy9901", dao.getPetById(9901).getName());
        assertEquals("available", dao.getPetById(9901).getStatus());

        Category category = new Category();
        category = dao.getPetById(9901).getCategory();
        dao.getPetById(9901).setCategory(category);
        assertEquals("dog", category.getName());
        assertEquals(10, category.getId());

        assertEquals(9901, dao.getPetById(9901).getId());

        ArrayList array = new ArrayList();
        assertEquals(array, dao.getPetById(9901).getPhotoUrls());


        List list = new ArrayList();
        list = dao.getPetById(9901).getTags();
        dao.getPetById(9901).setTags(list);
        assertEquals(list, dao.getPetById(9901).getTags());
    }
}