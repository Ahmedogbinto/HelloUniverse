package com.expacex.decouverte.enginspaciaux;

public class DepassementTonnageException extends Exception{
    public int tonnageEnExces;

    public DepassementTonnageException (int tonnageEnExces){
        super("La cargaison ne pourra etre chargee car elle presente un tonnage en exces de "+tonnageEnExces);
        this.tonnageEnExces = tonnageEnExces;
    }
}
