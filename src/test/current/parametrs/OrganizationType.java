package test.current.parametrs;

public enum OrganizationType {
    TRUST,
    PRIVATE_LIMITED_COMPANY,
    OPEN_JOINT_STOCK_COMPANY;

    public static String organizationTypeList(){
        String list="";
        for(OrganizationType organizationType:values()){
            list+=organizationType+" ";
        }
        return list;
    }
}
