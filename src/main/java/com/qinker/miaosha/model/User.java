package com.qinker.miaosha.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private Long id;
    private String name;

}
