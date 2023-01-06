package basics.enums.abstract_methods;

import jdk.swing.interop.SwingInterOpUtils;

import javax.print.Doc;

public class TestDocument {
    public static void main(String[] args) {
        Person p = new Person();
        p.setDocType(DocType.CPF);
        p.setDocument(p.getDocType().generateTestDoc());

        System.out.println(p);

        Person c = new Person();
        c.setDocType(DocType.CNPJ);
        c.setDocument("00.000.000/0000-00");

        System.out.println(c);
    }
}
