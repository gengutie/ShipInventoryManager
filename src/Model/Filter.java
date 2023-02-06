package Model;

public final class Filter {
    private int type;
    private String criteria;

    /**
     * Obtiene el criterio
     * @return criterio
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Asigna el criterio
     * @param criteria criterio
     */
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    /**
     * Obtiene el tipo
     * @return tipo
     */
    public int getType() {
        return type;
    }

    /**
     * Asigna el tipo
     * @param type tipo
     */
    public void setType(int type) {
        this.type = type;
    }
}
