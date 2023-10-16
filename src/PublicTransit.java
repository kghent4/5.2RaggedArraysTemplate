public class PublicTransit{
    String[][] busses  = {{"Sneffels Mt", "Cornelia St", "Sierra Vista", "Lee St"},
                          {"Cornelia St", "Lee St", "Etterby St", "Well Penn Rd", "Sneffels Mt"},
                          {"Whittis St", "Cristowe Rd", "Etterby St", "Forest St"},
                          {"Turpentine Ln", "McAndie Ct", "Sierra Vista", "Well Penn Rd", "Bircham St", "Landmere Ln"}};
     
    /*Assume that bus numbers correspond to rows of the jagged array.
     *For example, the 0th row corresponds to the route for bus #0.*/

    public PublicTransit(){
    }

    public void findRoute(String start, String stop){
        //Your code here

        /*This method should determine if there is a valid bus route from the given
         * starting point to the given stopping point. If there is no valid route,
         * let the user know. If there is a valid route, print out which bus the
         * user should take and all of the stops between the start and stop.
         * 
         * Use nested loops for full credit!
         * 
         * Example:
         * 
         * start = "Forest St"; stop = "Cristowe Rd";
         * SOPL: "There is no valid route between these two locations."
         * (unless you're doing the challenge add on...)
         * 
         * start = "Cornelia St"; stop = "Lee St";
         * SOPL: "Bus 0: Cornelia St -> Sierra Vista -> Lee St"
         * (unless you're doing the challenge add on...)
         * 
         * start = "Well Penn Rd"; stop = "Bircham St";
         * SOPL: "Bus 3: Well Penn Rd -> Bircham St"
         * (unless you're doing the challenge add on...)
         */
    }
}