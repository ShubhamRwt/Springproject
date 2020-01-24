package com.elastic.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product",type ="customer",shards = 5)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    public String id;
    public long phno;
    public String Firstname;
    public String Lastname;


}
