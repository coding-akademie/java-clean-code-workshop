package de.coding.akademie.names;

public class Rule_5_Avoid_Encodings {

    // Bad Code

    private String m_dsc; // Textual Description
    private boolean b_con ; // connected



    private boolean connected;   // Clean 1
    private boolean isConnected; // Clean 2




    private String description;  // Clean

    // Bad
    public void setName(String name){
        m_dsc = name;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }


    public boolean isConnected() {
        return isConnected;
    }

    // Clean
    public void setDescription(String description){
        this.description = description;
    }

}
