package de.coding.akademie.function;

public class Rule_2_No_Boolean {

    // response(request, true, true)
    // response(request, true, false)
    // response(request, false, true)
    // response(request, false, false)

    public String response(Request request, boolean isFormatted){

        StringBuffer result =  new StringBuffer();
        // 5 Zeilen
        if(isFormatted){
            result.append("first");

        } else{
            // do something else0
        }
        return result.toString();
    }



    public String formatData(Request request, Employee employee ){

        if(employee.getName().equals(null) || employee.getName().length() == 0)
           return getFormattedResponse(request);
           //  return response(request, true);
         else
             return getNoneFormattedResponse(request);
             // return response(request, false);
    }




    public String getFormattedResponse(Request request){  // <=> response(request, true)
        // 5 Zeilen
        myRoutine();
        StringBuffer result =  new StringBuffer();
        // if zweig..
            result.append("first");
        return result.toString();
    }


    public String getNoneFormattedResponse(Request request){  // <=> response(request, false)
        // 5 Zeilen
        myRoutine();
        StringBuffer result =  new StringBuffer();
        // else zweig.
        return result.toString();
    }

    private void myRoutine(){
        // 5 zeilen code
    }



}
