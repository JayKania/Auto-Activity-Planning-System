package com.project.Group1;

import com.project.Group1.Bean.ICRCallAssignment;
import com.project.Group1.CommandFactory.Command;
import com.project.Group1.CommandFactory.CommandFactory;
import com.project.Group1.CommandFactory.ICommandFactory;
import com.project.Group1.Database.Database;
import com.project.Group1.Database.IDatabase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:application-test.properties")
public class CallAssignmentController {
    @Autowired
    Environment env;
    @Test
    void testExecute() {
        ICommandFactory factory = new CommandFactory();
        String[] args=new String[1];
        args[0]="1";
        Command getItems= factory.getICRCallAssignmentCommand(Database.getInstance(),args,env);
        assertNotNull(getItems.execute());
    }

}
