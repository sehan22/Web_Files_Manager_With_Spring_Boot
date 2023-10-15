package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class FileManager {
//    @Id
    private String id;
    private String name;
    private String path;
}
