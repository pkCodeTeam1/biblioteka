package pl.edu.pk.pkCodeTeam1.biblioteka;

public interface IObserved {
		public void addObserver(Reader r);
		public void deleteObserver(Reader r);
		public void notifyObserver();
}
