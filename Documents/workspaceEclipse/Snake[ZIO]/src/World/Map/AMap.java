package World.Map;

import World.Object.AActor;

public abstract class AMap {
	public class Field {
		private AActor object = null;

		public boolean isFree() {
			if (object == null)
				return true;
			else
				return false;
		}

		public void push(AActor a) {
			object = a;
		}

		public void clear() {
			object = null;
		}

	}

	private Field[][] map;

	@SuppressWarnings("unused")
	private AMap() {
	}

	public AMap(int x, int y) {
		map = new Field[x][y];
	}

	public Field getPoint(int x, int y) {
		return map[x][y];
	}
}
