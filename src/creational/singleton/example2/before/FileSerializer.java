package creational.singleton.example2.before;

public class FileSerializer {

    public String serialize(Instance instance, String format) {
        if("JSON".equals(format)) {
            return convertJsonToString(instance);
        } else if("XML".equals(format)) {
            return convertXmlToString(instance);
        } else if("YML".equals(format)) {
            return covertYmlToString(instance);
        } else {
            return "Not supported format";
        }
    }

    /**
     * Métodos dummy, acá se hace la lógica como tal de serializar el objeto,
     * bien sea que se haga manual, llamando librerías de terceros, etc
     */
    private String covertYmlToString(Instance instance) {
        return "foo";
    }

    private String convertXmlToString(Instance instance) {
        return "bar";
    }

    private String convertJsonToString(Instance instance) {
        return "meh";
    }

}
