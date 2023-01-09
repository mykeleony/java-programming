package intermediates.enums.abstract_methods;

public enum DocType {
    CPF {
        @Override
        public String generateTestDoc() {
            return "000.000.000-00";
        }
    },

    CNPJ {
        @Override
        public String generateTestDoc() {
            return "00.000.000/0000-00";
        }
    };

    public abstract String generateTestDoc();
}
