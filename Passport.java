class Passport{
static String cprLoc;
static int dcdrLoc;
static String surNm;
static String givenNm;
static String dateOfBirth;
static String emailId;
static boolean isEmailLoginSm;
static String lId;
static 


public static boolean createPassport(String cprLocation, int dcdrLocation,String surName,String givenName, String dob, String Email,boolean isEmailLoginSame, String loginId, String password, String hintQues, String hintAns, String captcha){
boolean isPassportDataCreated = false;
boolean isDcdrLocationValid = false;
boolean isSurNameValid = false;
boolean isEmailLoginSameValid  = false;
boolean isGivenNameValid = false;

if(dcdrLocation>0){
dcdrLoc = dcdrLocation;
isDcdrlocationValid = true;
}else{
System.out.println("Please provide valid dcdrLocation");
}
if(surName!=null){
surNm = surName;
issurNameValid = true;
}else{
System.out.println("Please provide surName");
}
if(givenName!=null){
givenNm = givenName ;
isGivenNameValid = true;
}else{
System.out.println("Please provide valid givenName");
}

if(isEmailLoginSameValid && issurNameValid && isGivenNameValid){
isPassportDataCreated = true;
}
return isPassportDataCreated;
}
