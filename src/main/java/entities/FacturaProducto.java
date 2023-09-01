package entities;

public class FacturaProducto {
    private int idFactura;
    private int IdProducto;
    private int cantidad;

    public FacturaProducto(int idFactura, int idProducto, int cantidad) {
        this.idFactura = idFactura;
        this.IdProducto = idProducto;
        this.cantidad = cantidad;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

}
