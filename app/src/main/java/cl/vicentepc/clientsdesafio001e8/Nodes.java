package cl.vicentepc.clientsdesafio001e8;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Nodes {

    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();


    public DatabaseReference clients(){

        return root.child("clients").child("jhkkjnkjn");

    }

    public DatabaseReference credentials(){
        return root.child("credentials");
    }

}
