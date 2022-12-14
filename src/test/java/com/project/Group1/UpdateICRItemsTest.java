package com.project.Group1;

import com.project.Group1.CommandFactory.Command;
import com.project.Group1.CommandFactory.CommandFactory;
import com.project.Group1.CommandFactory.ICommandFactory;
import com.project.Group1.Database.Database;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:application-test.properties")
public class UpdateICRItemsTest {

    @Autowired
    Environment env;

    @Test
    void testExecute() {
        ICommandFactory factory = new CommandFactory();
        String[] args = new String[5];
        args[0] = "1";
        args[1] = "7890";
        args[2] = "Winter Coat";
        args[3] = "4";
        args[4] = "3";
        Command getICRItems = factory.getUpdateICRItems(Database.getInstance(), args, env);
        assertNotNull(getICRItems.execute());
    }

}
