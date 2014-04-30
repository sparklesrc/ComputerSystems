package app.zelper;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author SparKLes
 * 
 * Descripcion: Aqui se guarda los tipos de Usuario <ROLES> que usaran el sistema
 * PCS como Administrador del Sistema
 * ADMINISTRADOR como ADMIN para la Empresa cliente
 * EMPLEADO de la empresa
 */

public enum RolesEnum {

    PCS(0),
    ADMINISTRADOR(1), 
    EMPLEADO(2);
    
    private Integer val;
    
    private static final Map<Integer, RolesEnum> lookup = new HashMap<Integer, RolesEnum>();

    RolesEnum(Integer val) {
        this.val = val;
    }

    static {
        for (RolesEnum d : RolesEnum.values()) {
            lookup.put(d.getValue(), d);
        }
    }

    public int getValue() {
        return val;
    }

    public static RolesEnum get(Integer abbreviation) {
        return lookup.get(abbreviation);
    }
}
