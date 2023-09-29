package com.nasircode.booking;

import com.nasircode.car.Car;
import com.nasircode.users.User;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class CarBooking {
    private UUID bookingID;
    private User user;
    private Car car;
    private LocalDateTime bookingTime;
    private boolean isCanceled;

    public CarBooking(UUID bookingID, User user, Car car, LocalDateTime bookingTime, boolean isCanceled) {
        this.bookingID = bookingID;
        this.user = user;
        this.car = car;
        this.bookingTime = bookingTime;
        this.isCanceled = isCanceled;
    }

    public CarBooking(UUID bookingId, User user, Car car, LocalDateTime bookingTime) {
        this(bookingId, user, car, bookingTime, false);
    }

    public UUID getBookingID() {
        return bookingID;
    }

    public void setBookingID(UUID bookingID) {
        this.bookingID = bookingID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBooking that = (CarBooking) o;
        return isCanceled == that.isCanceled && Objects.equals(bookingID, that.bookingID) && Objects.equals(user, that.user) && Objects.equals(car, that.car) && Objects.equals(bookingTime, that.bookingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingID, user, car, bookingTime, isCanceled);
    }

    @Override
    public String toString() {
        return "CarBooking{" +
                "bookingID=" + bookingID +
                ", user=" + user +
                ", car=" + car +
                ", bookingTime=" + bookingTime +
                ", isCanceled=" + isCanceled +
                '}';
    }
}
