package se.lexicon.model;

import java.util.Arrays;

public class MyList<T>{

    private T[] internalArray = (T[]) new Object[0];


    public boolean add(T element){

        if (element == null) {
            return false;
        }

        //Copy and expand array
        T[] copyOf = Arrays.copyOf(internalArray,internalArray.length+1);

        //Add Element in the array.
        copyOf[copyOf.length -1] = element;

        //Replacing and calculates the new salary
        this.internalArray = copyOf;

        return true;
    }

    public T getByIndex (int index){

        if (index < 0 || index >= internalArray.length){
            return null;
        }

        return internalArray[index];

    }

    public int indexOf (T element){

        if (element.equals(null)){
            return -2;
        }


        for(int i = 0; i < internalArray.length; i++){
            if (internalArray[i].equals(element)){
                return i;
            }
        }


        return -1;
    }







}



