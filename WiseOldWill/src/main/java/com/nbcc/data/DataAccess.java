/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.data;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.nbcc.entities.Person;
import com.nbcc.entities.Student;
import com.nbcc.entities.Teacher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;

import java.util.List;
import org.bson.Document;

/**
 *
 * @author billy
 */
public class DataAccess {

    //List of retrieved names. Check this list for the name that appears most
    List<String> fieldsToCheck = new ArrayList<String>();
    MongoClient mongoClient = new MongoClient();

    DB database = mongoClient.getDB("myclassmates");
    DBCollection collection = database.getCollection("people");

    /**
     * Find a student that matches the most fields Hits the database for each
     * field, retrieving all names based on whether or not they have a matching
     * field After this, it adds each of those names to an arraylist, it will
     * then check the arraylist for the most common name and return it
     *
     * @param guessStudent
     */
    public String findMatchStudent(Student guessStudent) {
        try {
            //Retrieving names based on eye color
            DBCursor eyeResults = collection.find(new BasicDBObject("eye_color", guessStudent.getEye_color()),
                    new BasicDBObject("name", 1));

            for (DBObject retrieved : eyeResults) {
                fieldsToCheck.add(retrieved.get("name").toString());
            }

            //Closing the connection
            eyeResults.close();

            //Retrieving names based on hair color
            DBCursor hairColorResults = collection.find(new BasicDBObject("hair_color", guessStudent.getHair_color()),
                    new BasicDBObject("name", 1));

            for (DBObject retrieved : hairColorResults) {
                fieldsToCheck.add(retrieved.get("name").toString());
            }

            hairColorResults.close();

            //Retrieving names based on height
            DBCursor heightResults = collection.find(new BasicDBObject("height", guessStudent.getHeight()),
                    new BasicDBObject("name", 1));

            for (DBObject retrieved : heightResults) {
                fieldsToCheck.add(retrieved.get("name").toString());
            }

            heightResults.close();

            //Retrieving names based on age
            DBCursor ageResults = collection.find(new BasicDBObject("age", guessStudent.getAge()),
                    new BasicDBObject("name", 1));

            for (DBObject retrieved : ageResults) {
                fieldsToCheck.add(retrieved.get("name").toString());
            }

            ageResults.close();

            //Retrieving names based on gender
            DBCursor genderResults = collection.find(new BasicDBObject("gender", guessStudent.getGender()),
                    new BasicDBObject("name", 1));

            for (DBObject retrieved : genderResults) {
                fieldsToCheck.add(retrieved.get("name").toString());
            }

            genderResults.close();

            //These lines may break the code for some unknown reason
            //Retrieving names based on hair length
            DBCursor hairLengthResults = collection.find(new BasicDBObject("hair_length", guessStudent.getHair_length()),
                    new BasicDBObject("name", 1));

            for (DBObject retrieved : hairLengthResults) {
                fieldsToCheck.add(retrieved.get("name").toString());
            }

            hairLengthResults.close();

            //Retrieving names based on hair style
            DBCursor hairStyleResults = collection.find(new BasicDBObject("hair_style", guessStudent.getHair_style()),
                    new BasicDBObject("name", 1));

            for (DBObject retrieved : hairStyleResults) {
                fieldsToCheck.add(retrieved.get("name").toString());
            }

            hairStyleResults.close();

            //Retrieving names based on whether or not someone has freckles
            DBCursor frecklesResult = collection.find(new BasicDBObject("freckles", guessStudent.getFreckles()),
                    new BasicDBObject("name", 1));

            for (DBObject retrieved : frecklesResult) {
                fieldsToCheck.add(retrieved.get("name").toString());
            }

            frecklesResult.close();

            //Retrieving names based on class
            DBCursor classResult = collection.find(new BasicDBObject("class", guessStudent.getClass_in()),
                    new BasicDBObject("name", 1));

            while (classResult.hasNext()) {
                fieldsToCheck.add(classResult.next().get("name").toString());
            }

            classResult.close();

            //Getting the most frequent name
            HashMap<String, Integer> elementCountMap = new HashMap<String, Integer>();

            for (String name : fieldsToCheck) {
                if (elementCountMap.containsKey(name)) {
                    elementCountMap.put(name, elementCountMap.get(name) + 1);
                } else {
                    elementCountMap.put(name, 1);
                }
            }

            Set<Entry<String, Integer>> entrySet = elementCountMap.entrySet();

            String element = "";
            int frequency = 1;

            //Checking to see what name most commonly occurs
            //Setting the element equal to the name with the highest frequency in my arraylist
            for (Entry<String, Integer> entry : entrySet) {
                if (entry.getValue() > frequency) {
                    element = entry.getKey();
                    frequency = entry.getValue();
                }
            }

            //Checks to see if it successfully retrieved a record
            if (frequency > 1) {
                return "My guess is..." + element;
            }
        } catch (Exception ex) {
            p(ex.getMessage());
        } finally {
            //Closing the client connection
            mongoClient.close();
        }

        //If things go wrong, return this
        return "Cannot find student";

    }

    /**
     * Method called when finding the teacher in the database
     *
     * @param guessTeacher
     * @return
     */
    public String findTeacher(Teacher guessTeacher) {
        //Retrieving names based on eye color
        DBCursor eyeResults = collection.find(new BasicDBObject("eye_color", guessTeacher.getEye_color()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : eyeResults) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on hair color
        DBCursor hairColorResults = collection.find(new BasicDBObject("hair_color", guessTeacher.getHair_color()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : hairColorResults) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on height
        DBCursor heightResults = collection.find(new BasicDBObject("height", guessTeacher.getHeight()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : heightResults) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on age
        DBCursor ageResults = collection.find(new BasicDBObject("age", guessTeacher.getAge()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : ageResults) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on gender
        DBCursor genderResults = collection.find(new BasicDBObject("gender", guessTeacher.getGender()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : genderResults) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on hair length
        DBCursor hairLengthResults = collection.find(new BasicDBObject("hair_length", guessTeacher.getHair_length()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : hairLengthResults) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on hair style
        DBCursor hairStyleResults = collection.find(new BasicDBObject("hair_style", guessTeacher.getHair_style()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : hairStyleResults) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on whether or not someone has freckles
        DBCursor frecklesResult = collection.find(new BasicDBObject("freckles", guessTeacher.getFreckles()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : frecklesResult) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on instituition
        DBCursor institutionResults = collection.find(new BasicDBObject("institution", guessTeacher.getInstitution()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : institutionResults) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Retrieving names based on role
        DBCursor roleResult = collection.find(new BasicDBObject("institution", guessTeacher.getRole()),
                new BasicDBObject("name", 1));

        for (DBObject retrieved : roleResult) {
            fieldsToCheck.add(retrieved.get("name").toString());
        }

        //Getting the most frequent name
        HashMap<String, Integer> elementCountMap = new HashMap<String, Integer>();

        for (String name : fieldsToCheck) {
            if (elementCountMap.containsKey(name)) {
                elementCountMap.put(name, elementCountMap.get(name) + 1);
            } else {
                elementCountMap.put(name, 1);
            }
        }

        //Checking for the most common name in the list of names
        Set<Entry<String, Integer>> entrySet = elementCountMap.entrySet();

        String element = "";
        int frequency = 1;

        //Iterating through looking for the element with the highest frequency
        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > frequency) {
                element = entry.getKey();
                frequency = entry.getValue();
            }
        }

        if (frequency > 1) {
            return element;
        }

        //Return if things go awry
        return "Cannot find instructor";
    }

    /**
     * @description Inserts a new record for a person if they're not already in
     * the database
     * @param student
     */
    public void createNewStudent(Student student, String name) {

        DBObject newPerson = new BasicDBObject("name", name).append("eye_color", student.getEye_color()).append("hair_color", student.getHair_color()).append("height", student.getHeight())
                .append("age", student.getAge())
                .append("gender", student.getGender()).append("hair_length", student.getHair_length())
                .append("hair_style", student.getHair_style())
                .append("freckles", student.getFreckles()).append("class", student.getClass_in());

        collection.insert(newPerson);
    }

    /**
     * Creating a new instructor based off a teacher being passed in and a name
     *
     * @param teacher
     * @param name
     */
    public void createNewInstructor(Teacher teacher, String name) {

        DBObject newPerson = new BasicDBObject("name", name).append("eye_color", teacher.getEye_color()).append("hair_color", teacher.getHair_color()).append("height", teacher.getHeight())
                .append("age", teacher.getAge())
                .append("gender", teacher.getGender()).append("hair_length", teacher.getHair_length())
                .append("hair_style", teacher.getHair_style())
                .append("freckles", teacher.getFreckles()).append("instituition", teacher.getInstitution())
                .append("role", teacher.getRole());

        collection.insert(newPerson);
    }

    public String[] GetAllDbInfo() {
        return null;
    }

    static void p(String msg) {
        System.out.println(msg);
    }

}
