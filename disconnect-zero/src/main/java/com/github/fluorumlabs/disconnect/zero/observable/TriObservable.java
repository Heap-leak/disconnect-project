package com.github.fluorumlabs.disconnect.zero.observable;

import com.github.fluorumlabs.disconnect.zero.Application;


public class TriObservable<VALUE_A, VALUE_B, VALUE_C> extends ObservableBase<Triplet<VALUE_A, VALUE_B, VALUE_C>> {
	TriObservable() {
		setCurrentValue(Triplet.of(null, null, null));
	}

	public <NEW_VALUE> Observable<NEW_VALUE> apply(TriFunction<VALUE_A, VALUE_B, VALUE_C, NEW_VALUE> mapper) {
		Observable<NEW_VALUE> observable = new Observable<>();
		acceptImpl(value -> observable.pushNewValue(mapper.apply(value.getValueA(), value.getValueB(),
				value.getValueC())));
		return observable;
	}

	public <NEW_VALUE> Observable<NEW_VALUE> applyAsync(TriFunction<VALUE_A, VALUE_B, VALUE_C, NEW_VALUE> mapper) {
		Observable<NEW_VALUE> observable = new Observable<>();
		acceptImpl(value -> new Thread(() -> observable.pushNewValue(mapper.apply(value.getValueA(),
				value.getValueB(), value.getValueC()))).start());
		return observable;
	}

	public Forked<VALUE_A, VALUE_B, VALUE_C> when(TriPredicate<VALUE_A, VALUE_B, VALUE_C> predicate) {
		Forked<VALUE_A, VALUE_B, VALUE_C> forkedObserver = new Forked<>();
		acceptImpl(value -> forkedObserver.pushNewValue(value.toQuad(predicate.test(value.getValueA(),
                value.getValueB(), value.getValueC()))));
		return forkedObserver;
	}

	public Forked<VALUE_A, VALUE_B, VALUE_C> whenAsync(TriPredicate<VALUE_A, VALUE_B, VALUE_C> predicate) {
		Forked<VALUE_A, VALUE_B, VALUE_C> forkedObserver = new Forked<>();
		acceptImpl(value -> new Thread(() -> forkedObserver.pushNewValue(value.toQuad(predicate.test(value.getValueA(),
				value.getValueB(), value.getValueC())))).start());
		return forkedObserver;
	}

	public TriObservable<VALUE_A, VALUE_B, VALUE_C> nonNull() {
		TriObservable<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable<>();
		acceptImpl(value -> {
			if (value.getValueA() != null && value.getValueB() != null && value.getValueC() != null) {
				observable.pushNewValue(value);
			}
		});
		return observable;
	}


	public TriObservable<VALUE_A, VALUE_B, VALUE_C> filter(TriPredicate<VALUE_A, VALUE_B, VALUE_C> predicate) {
		TriObservable<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable<>();
		acceptImpl(value -> {
			if (predicate.test(value.getValueA(), value.getValueB(), value.getValueC())) {
				observable.pushNewValue(value);
			}
		});
		return observable;
	}

	public TriObservable<VALUE_A, VALUE_B, VALUE_C> filterAsync(TriPredicate<VALUE_A, VALUE_B, VALUE_C> predicate) {
		TriObservable<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable<>();
		acceptImpl(value -> new Thread(() -> {
			if (predicate.test(value.getValueA(), value.getValueB(), value.getValueC())) {
				observable.pushNewValue(value);
			}
		}).start());
		return observable;
	}

	public TriObservable<VALUE_A, VALUE_B, VALUE_C> on(SimpleObservableEvent event) {
		Delayed<VALUE_A, VALUE_B, VALUE_C> observable = new Delayed<>();
		acceptImpl(observable::setPendingValue);
		event.accept(observable::acceptPendingValue);
		return observable;
	}

	public TriObservable<VALUE_A, VALUE_B, VALUE_C> debounce(int milliseconds) {
		TriObservable<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable<>();
		acceptImpl(value -> Application.debounce(observable, () -> observable.pushNewValue(value), milliseconds));
		return observable;
	}

	public TriObservable<VALUE_A, VALUE_B, VALUE_C> accept(TriConsumer<VALUE_A, VALUE_B, VALUE_C> consumer) {
		acceptImpl(value -> consumer.accept(value.getValueA(), value.getValueB(), value.getValueC()));
		return this;
	}

	public TriObservable<VALUE_A, VALUE_B, VALUE_C> acceptAsync(TriConsumer<VALUE_A, VALUE_B, VALUE_C> consumer) {
		acceptImpl(value -> new Thread(() -> consumer.accept(value.getValueA(), value.getValueB(), value.getValueC())).start());
		return this;
	}

	public TriObservable<VALUE_A, VALUE_B, VALUE_C> accept(Runnable runnable) {
		acceptImpl(valuePair -> runnable.run());
		return this;
	}

	public TriObservable<VALUE_A, VALUE_B, VALUE_C> acceptAsync(Runnable runnable) {
		acceptImpl(valuePair -> new Thread(runnable).start());
		return this;
	}

	public VALUE_A getA() {
		return getCurrentValue().getValueA();
	}

	public VALUE_B getB() {
		return getCurrentValue().getValueB();
	}

	public VALUE_C getC() {
		return getCurrentValue().getValueC();
	}

	public static class Delayed<VALUE_A, VALUE_B, VALUE_C> extends TriObservable<VALUE_A, VALUE_B, VALUE_C> {
		private Triplet<VALUE_A, VALUE_B, VALUE_C> pendingValue;

		private boolean hasPendingValue = false;

		void setPendingValue(Triplet<VALUE_A, VALUE_B, VALUE_C> value) {
			pendingValue = value;
			hasPendingValue = true;
		}

		void acceptPendingValue() {
			if (hasPendingValue) {
				hasPendingValue = false;
				pushNewValue(pendingValue, true);
				setCurrentValue(null);
			}
		}
	}

	public static class Guarded<VALUE_A, VALUE_B, VALUE_C> extends TriObservable<VALUE_A, VALUE_B, VALUE_C> {
		private Triplet<VALUE_A, VALUE_B, VALUE_C> pendingValue = Triplet.of(null, null, null);
		private boolean hasA = false;
		private boolean hasB = false;
		private boolean hasC = false;

		void pushValueA(VALUE_A value) {
			if (hasA && hasB && hasC) {
				pushNewValue(Triplet.of(value, getB(), getC()));
			} else {
				pendingValue = Triplet.of(value, pendingValue.getValueB(), pendingValue.getValueC());
				hasA = true;
				if (hasB && hasC) {
					pushNewValue(pendingValue);
				}
			}
		}

		void pushValueB(VALUE_B value) {
			if (hasA && hasB && hasC) {
				pushNewValue(Triplet.of(getA(), value, getC()));
			} else {
				pendingValue = Triplet.of(pendingValue.getValueA(), value, pendingValue.getValueC());
				hasB = true;
				if (hasA && hasC) {
					pushNewValue(pendingValue);
				}
			}
		}

		void pushValueC(VALUE_C value) {
			if (hasA && hasB && hasC) {
				pushNewValue(Triplet.of(getA(), getB(), value));
			} else {
				pendingValue = Triplet.of(pendingValue.getValueA(), pendingValue.getValueB(), value);
				hasC = true;
				if (hasA && hasB) {
					pushNewValue(pendingValue);
				}
			}
		}
	}

	public static class Forked<VALUE_A, VALUE_B, VALUE_C>
			extends ObservableBase<Quad<VALUE_A, VALUE_B, VALUE_C, Boolean>> {
		Forked() {
			setCurrentValue(Quad.of(null, null, null, false));
		}

		public TriObservable<VALUE_A, VALUE_B, VALUE_C> then() {
			TriObservable<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable<>();
			acceptImpl(value -> {
				if (value.getValueD()) {
					observable.pushNewValue(value, true);
				}
			});
			return observable;
		}

		public TriObservable.Forked<VALUE_A, VALUE_B, VALUE_C> then(TriConsumer<VALUE_A, VALUE_B, VALUE_C> consumer) {
			acceptImpl(value -> {
				if (value.getValueD()) {
					consumer.accept(value.getValueA(), value.getValueB(), value.getValueC());
				}
			});
			return this;
		}

		public TriObservable.Forked<VALUE_A, VALUE_B, VALUE_C> thenAsync(TriConsumer<VALUE_A, VALUE_B, VALUE_C> consumer) {
			acceptImpl(value -> {
				if (value.getValueD()) {
					new Thread(() -> consumer.accept(value.getValueA(), value.getValueB(), value.getValueC())).start();
				}
			});
			return this;
		}

		public TriObservable.Forked<VALUE_A, VALUE_B, VALUE_C> then(Runnable runnable) {
			acceptImpl(value -> {
				if (value.getValueD()) {
					runnable.run();
				}
			});
			return this;
		}

		public TriObservable.Forked<VALUE_A, VALUE_B, VALUE_C> thenAsync(Runnable runnable) {
			acceptImpl(value -> {
				if (value.getValueD()) {
					new Thread(runnable).start();
				}
			});
			return this;
		}

		public TriObservable<VALUE_A, VALUE_B, VALUE_C> orElse() {
			TriObservable<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable<>();
			acceptImpl(value -> {
				if (!value.getValueD()) {
					observable.pushNewValue(value, true);
				}
			});
			return observable;
		}

		public TriObservable.Forked<VALUE_A, VALUE_B, VALUE_C> orElse(TriConsumer<VALUE_A, VALUE_B, VALUE_C> consumer) {
			acceptImpl(value -> {
				if (!value.getValueD()) {
					consumer.accept(value.getValueA(), value.getValueB(), value.getValueC());
				}
			});
			return this;
		}

		public TriObservable.Forked<VALUE_A, VALUE_B, VALUE_C> orElseAsync(TriConsumer<VALUE_A, VALUE_B, VALUE_C> consumer) {
			acceptImpl(value -> {
				if (!value.getValueD()) {
					new Thread(() -> consumer.accept(value.getValueA(), value.getValueB(), value.getValueC())).start();
				}
			});
			return this;
		}

		public TriObservable.Forked<VALUE_A, VALUE_B, VALUE_C> orElse(Runnable runnable) {
			acceptImpl(value -> {
				if (!value.getValueD()) {
					runnable.run();
				}
			});
			return this;
		}

		public TriObservable.Forked<VALUE_A, VALUE_B, VALUE_C> orElseAsync(Runnable runnable) {
			acceptImpl(value -> {
				if (!value.getValueD()) {
					new Thread(runnable).start();
				}
			});
			return this;
		}

		@Override
		boolean equalFunction(Quad<VALUE_A, VALUE_B, VALUE_C, Boolean> a,
                              Quad<VALUE_A, VALUE_B, VALUE_C, Boolean> b) {
			return false;
		}
	}
}
