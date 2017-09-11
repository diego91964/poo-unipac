package br.edu.unipac.exemplos.equal;

public class ClasseB {

	 public String s;
	    
	 ClasseB() {
	        this.s = new String( "teste" );
	    }


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClasseB other = (ClasseB) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	 
}
