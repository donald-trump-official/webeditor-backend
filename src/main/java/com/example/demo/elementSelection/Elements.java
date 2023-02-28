package com.example.demo.elementSelection;

public class Elements {
    int elementID;
    String elementName;
    String elementType;
    String elementImg;

    public Elements(String elementName, String elementType, String elementImg) {
        this.elementName = elementName;
        this.elementType = elementType;
        this.elementImg = elementImg;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getElementImg() {
        return elementImg;
    }

    public void setElementImg(String elementImg) {
        this.elementImg = elementImg;
    }
}
