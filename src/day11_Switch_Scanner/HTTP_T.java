package day11_Switch_Scanner;

public class HTTP_T {

    public static void main(String[] args) {

        int statusCode = 400;
        String output = "";

        switch (statusCode) {
            case 200:
                output = "OK";
                break;
            case 201:
                output = "Created";
                break;
            case 202:
                output = "Accepted";
                break;
            case 301:
                output = "Moved Permanently";
                break;
            case 303:
                output = "See Other";
                break;
            case 304:
                output = "Not Modified";
                break;
            case 307:
                output = "Temporary Redirect";
                break;
            case 400:
                output = "Bad Request";
                break;
            case 401:
                output = "Unauthorized";
                break;
            case 403:
                output = "Forbidden";
                break;
            case 404:
                output = "Not Found";
                break;
            case 410:
                output = "Gone";
                break;
            case 500:
                output = "Internal Server Error";
                break;
            default:
                output = "Service Unavailable";
        }
        System.out.println(output);

    }
}

/*
5. HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable


         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok


 */   // general task