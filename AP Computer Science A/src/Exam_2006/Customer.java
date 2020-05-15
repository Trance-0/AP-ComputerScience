package Exam_2006;

public class Customer {
    // constructs a Customer with given name and ID number
    public Customer(String name, int idNum) {
        /* implementation not shown */ }

    // returns the customer's name
    public String getName() {
        /* implementation not shown */
        return null;
    }

    // returns the customer's id
    public int getID() {
        return 0;
        /* implementation not shown */ }

    // returns 0 when this customer is equal to other;
    // a positive integer when this customer is greater than other;
    // a negative integer when this customer is less than other
    public int compareCustomer(Customer other) {
        if (this.getName().equals(other.getName())) {
            return this.getID() - other.getID();
        }
        return this.getName().compareTo(other.getName());
    }

    // fills result with customers merged from the
    // beginning of list1 and list2;
    // result contains no duplicates and is sorted in
    // ascending order by customer
    // precondition: //
    //
    // result.length > 0; list1.length >= result.length; list1 contains no
    // duplicates; list2.length >= result.length; list2 contains no duplicates;
    // list1 and list2 are sorted in ascending order by customer
    //
    //
    //
    // postcondition: list1, list2 are not modified
public static void prefixMerge(Customer[] list1,Customer[] list2,Customer[] result){
    int list1Index=0;
    int list2Index=0;
    for (int i=0;i<result.length;i++){
            if(list1[list1Index].compareCustomer(list2[list2Index])<0){
                result[i]=list1[list1Index];
                list1Index++;
            }
            else if (list1[list1Index].compareCustomer(list2[list2Index])>0){
                result[i]=list2[list2Index];
                list2Index++;
            }
            else{
                result[i]=list1[list1Index];
                list1Index++;
                list2Index++;
            }
    }
}
}
// There may be fields, constructors, and methods that are not shown. }