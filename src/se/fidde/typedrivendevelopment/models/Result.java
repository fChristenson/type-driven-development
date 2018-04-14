package se.fidde.typedrivendevelopment.models;

public class Result<T> {
	private final Exception error;
	private final T result;
	
	private Result(Exception error, T result) {
		this.error = error;
		this.result = result;
	}
	
	public static <T> Result<T> left(Exception error) {
		return new Result<T>(error, null);
	}
	
	public static <T> Result<T> right(T result) {
		return new Result<T>(null, result);
	}

	public Exception getError() {
		return error;
	}

	public T getResults() {
		return result;
	}
}
