package br.ufg.com.Sistema_pedidos.Produto;

public class Produto {
    private int id;
    private String nome;
    private String description;
    private double price;

    public Produto(int id, String nome, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
