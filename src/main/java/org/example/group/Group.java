//package org.example.group;
//
//import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.ToString;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component("GroupComponent")
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Getter
//public class Group {
//    @Value("ISIB-22-1")
//    private String groupName;
//
//    @Autowired
//    private Student elder;
//
//
//    public Group() {}
//
//    public void setDirector(Student elder) {
//        this.elder = elder;
//    }
//
//    public Student getDirector() {
//        return this.elder;
//    }
//
//}
