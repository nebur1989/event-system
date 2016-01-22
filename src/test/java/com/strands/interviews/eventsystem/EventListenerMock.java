package com.strands.interviews.eventsystem;

class EventListenerMock implements InterviewEventListener {
	private boolean called;
	Class<?>[] classes;
	public int count;

	public EventListenerMock(final Class<?>[] classes) {
		this.classes = classes;
	}

	public void handleEvent(final InterviewEvent event) {
		called = true;
		count++;
	}

	public void resetCalled() {
		called = false;
	}

	public boolean isCalled() {
		return called;
	}

	public Class<?>[] getHandledEventClasses() {
		return classes;
	}
}