package com.project.Group1.CommandFactory;

import com.project.Group1.Database.IDatabase;
import org.springframework.core.env.Environment;

public interface ICommandFactory {

    Command getProjectIDCommand(IDatabase db, String[] args, Environment env);

    Command getVendorIDCommand(IDatabase db, String[] args, Environment env);

    Command getProjectsCommand(IDatabase db, String[] args, Environment env);

    Command getVendorsCommand(IDatabase db, String[] args, Environment env);

    Command getPOListCommand(IDatabase db, String[] args, Environment env);

    Command getSippingListCommand(IDatabase db, String[] args, Environment env);

    Command getICRIDCommand(IDatabase db, String[] args, Environment env);

    Command getICRItemsCommand(IDatabase db, String[] args, Environment env);

    Command getUserDetailsCommand(IDatabase db, String[] args, Environment env);

    Command getRoleIDCommand(IDatabase db, String[] args, Environment env);

    Command getAdminUserCommand(IDatabase db, String[] args, Environment env);

    Command addUserRoleCommand(IDatabase db, String[] args, Environment env);

    Command getUsersBasedOnRoleIDCommand(IDatabase db, String[] args, Environment env);

    Command getVendorIdCommand(IDatabase db, String[] args, Environment env);

    Command getShippingListID(IDatabase db, String[] args, Environment env);

    Command saveUploadExcel(IDatabase db, String[] args, Environment env);

    Command getICRCallAssignmentCommand(IDatabase db, String[] args, Environment env);

    Command getInspectorCommand(IDatabase db, String[] args, Environment env);

    Command getInspectorEmailCommand(IDatabase db, String[] args, Environment env);

    Command getICRVendorDashboardCommand(IDatabase db, String[] args, Environment env);

    Command getUpdateICRStatusCommand(IDatabase db, String[] args, Environment env);

    Command getUpdateICR(IDatabase instance, String[] args2, Environment env);

    Command getUpdateICRItems(IDatabase instance, String[] args3, Environment env);

    Command getIRDataCommand(IDatabase instance, String[] args4, Environment env);

    Command getUpdateIR(IDatabase instance, String[] args2, Environment env);

    Command getUpdateIRItems(IDatabase instance, String[] args3, Environment env);

    Command getAllIRItems(IDatabase instance, String[] args3, Environment env);
}
