package org.example.model;

import lombok.Data;
import org.example.entity.CardsMstr;

import java.util.List;

@Data
public class Response {

   List<CardsMstr> optionsList;
   List<CardsMstr> options;
}
