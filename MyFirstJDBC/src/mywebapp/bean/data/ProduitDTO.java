package mywebapp.bean.data;

/**
 * Classe Produit contenant une reference, un nom et un prix.
 * 
 */
public class ProduitDTO {

	private int idProduit;
	private String nomProduit;
	private double prixProduit;

	/**
	 * Constructeur sans parametres.
	 */
	public ProduitDTO() {
		idProduit = 0;
		nomProduit = null;
		prixProduit = 0;
	}

	/**
	 * Constructeur avec reference, nom et prix.
	 * 
	 * @param reference
	 *            la reference du produit
	 * @param nom
	 *            le nom du produit
	 * @param prix
	 *            le prix du produit
	 */
	public ProduitDTO(final int reference, final String nom, final double prix) {
		this.idProduit = reference;
		this.nomProduit = nom;
		this.prixProduit = prix;
	}

	/**
	 * @return the reference
	 */
	public int getIdProduit() {
		return idProduit;
	}

	/**
	 * @param reference
	 *            the reference to set
	 */
	public void setidProduit(final int idProduit) {
		this.idProduit = idProduit;
	}

	/**
	 * @return the nom
	 */
	public String getNomProduit() {
		return nomProduit;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNomProduit(final String nomProduit) {
		this.nomProduit = nomProduit;
	}

	/**
	 * @return the prix
	 */
	public double getPrixProduit() {
		return prixProduit;
	}

	/**
	 * @param prix
	 *            the prix to set
	 */
	public void setPrixProduit(final double prixProduit) {
		this.prixProduit = prixProduit;
	}
}
