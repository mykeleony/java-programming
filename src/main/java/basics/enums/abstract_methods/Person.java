package basics.enums.abstract_methods;

import javax.print.Doc;

public class Person {
    private DocType docType;
    private String document;

    public Person(String document) {
        this.document = document;
    }

    public Person() {
    }

    public DocType getDocType() {
        return docType;
    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Person{" +
                "docType=" + docType +
                ", document='" + document + '\'' +
                '}';
    }
}
