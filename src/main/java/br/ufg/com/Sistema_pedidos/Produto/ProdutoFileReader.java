package br.ufg.com.Sistema_pedidos.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoFileReader {
    public static List<Produto> lerArquivo(String caminhoArquivo) {
        List<Produto> produtos = new ArrayList<Produto>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int idProduto = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String descricao = dados[2];
                float preco = Float.parseFloat(dados[3]);
                Produto produto = new Produto(idProduto, nome, descricao, preco);
                produtos.add(produto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return produtos;
    }
}
