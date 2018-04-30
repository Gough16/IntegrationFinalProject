
public class Weights{
		//private fields
		private int pounds;
		private int sets;
		private int reps;
		
		//four constructors
		public Weights() {
			this(0, 0, 0);
		}

		public Weights(int p) {
			setPounds(p);
		}

		public Weights(int p, int s) {
			setPounds(p);
			setSets(s);
		}

		public Weights(int p, int s, int r) {
			setPounds(p);
			setSets(s);
			setReps(r);
		}

		public void setWorkOut(int p, int s, int r) {
			setPounds(p);
			setSets(s);
			setReps(r);
		}

		//setters
		public void setPounds(int p) {
			pounds = ((p >= 0 && p < 100) ? p : 0);
		}

		public void setSets(int s) {
			sets = ((s >= 0 && s < 100) ? s : 0);
		}

		public void setReps(int r) {
			reps = ((r >= 0 && r < 100) ? r : 0);
		}

		//getters
		public int getPounds() {
			return pounds;
		}

		public int getSets() {
			return sets;
		}

		public int getReps() {
			return reps;
		}

		//Method liftWeights where we will print the values out
		public String liftWeights() {
			return String.format("%02d:%02d:%02d", getPounds(), getSets(), getReps());
		}
}
