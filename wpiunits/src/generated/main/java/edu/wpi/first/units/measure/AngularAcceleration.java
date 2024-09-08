// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpiunits/generate_units.py. DO NOT MODIFY

package edu.wpi.first.units.measure;

import static edu.wpi.first.units.Units.*;
import edu.wpi.first.units.*;

@SuppressWarnings({"unchecked", "cast", "checkstyle", "PMD"})
public interface AngularAcceleration extends Measure<AngularAccelerationUnit> {
  static  AngularAcceleration ofRelativeUnits(double magnitude, AngularAccelerationUnit unit) {
    return new ImmutableAngularAcceleration(magnitude, unit.toBaseUnits(magnitude), unit);
  }

  static  AngularAcceleration ofBaseUnits(double baseUnitMagnitude, AngularAccelerationUnit unit) {
    return new ImmutableAngularAcceleration(unit.fromBaseUnits(baseUnitMagnitude), baseUnitMagnitude, unit);
  }

  @Override
  AngularAcceleration copy();

  @Override
  default MutAngularAcceleration mutableCopy() {
    return new MutAngularAcceleration(magnitude(), baseUnitMagnitude(), unit());
  }

  @Override
  AngularAccelerationUnit unit();

  @Override
  default AngularAccelerationUnit baseUnit() { return (AngularAccelerationUnit) unit().getBaseUnit(); }

  @Override
  default double in(AngularAccelerationUnit unit) {
    return unit.fromBaseUnits(baseUnitMagnitude());
  }

  @Override
  default AngularAcceleration unaryMinus() {
    return (AngularAcceleration) unit().ofBaseUnits(0 - baseUnitMagnitude());
  }

  @Override
  default AngularAcceleration plus(Measure<? extends AngularAccelerationUnit> other) {
    return (AngularAcceleration) unit().ofBaseUnits(baseUnitMagnitude() + other.baseUnitMagnitude());
  }

  @Override
  default AngularAcceleration minus(Measure<? extends AngularAccelerationUnit> other) {
    return (AngularAcceleration) unit().ofBaseUnits(baseUnitMagnitude() - other.baseUnitMagnitude());
  }

  @Override
  default AngularAcceleration times(double multiplier) {
    return (AngularAcceleration) unit().ofBaseUnits(baseUnitMagnitude() * multiplier);
  }

  @Override
  default AngularAcceleration divide(double divisor) {
    return (AngularAcceleration) unit().ofBaseUnits(baseUnitMagnitude() / divisor);
  }

  @Override
  default Velocity<AngularAccelerationUnit> per(TimeUnit period) {
    return divide(period.of(1));
  }


  @Override
  default Mult<AngularAccelerationUnit, AccelerationUnit<?>> times(Acceleration<?> multiplier) {
    return (Mult<AngularAccelerationUnit, AccelerationUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, AccelerationUnit<?>> divide(Acceleration<?> divisor) {
    return (Per<AngularAccelerationUnit, AccelerationUnit<?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, AngleUnit> times(Angle multiplier) {
    return (Mult<AngularAccelerationUnit, AngleUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, AngleUnit> divide(Angle divisor) {
    return (Per<AngularAccelerationUnit, AngleUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, AngularAccelerationUnit> times(AngularAcceleration multiplier) {
    return (Mult<AngularAccelerationUnit, AngularAccelerationUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Dimensionless divide(AngularAcceleration divisor) {
    return Value.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Mult<AngularAccelerationUnit, AngularMomentumUnit> times(AngularMomentum multiplier) {
    return (Mult<AngularAccelerationUnit, AngularMomentumUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, AngularMomentumUnit> divide(AngularMomentum divisor) {
    return (Per<AngularAccelerationUnit, AngularMomentumUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, AngularVelocityUnit> times(AngularVelocity multiplier) {
    return (Mult<AngularAccelerationUnit, AngularVelocityUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, AngularVelocityUnit> divide(AngularVelocity divisor) {
    return (Per<AngularAccelerationUnit, AngularVelocityUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, CurrentUnit> times(Current multiplier) {
    return (Mult<AngularAccelerationUnit, CurrentUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, CurrentUnit> divide(Current divisor) {
    return (Per<AngularAccelerationUnit, CurrentUnit>) Measure.super.divide(divisor);
  }

  @Override
  default AngularAcceleration divide(Dimensionless divisor) {
    return (AngularAcceleration) RadiansPerSecondPerSecond.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }

  @Override
  default AngularAcceleration times(Dimensionless multiplier) {
    return (AngularAcceleration) RadiansPerSecondPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }


  @Override
  default Mult<AngularAccelerationUnit, DistanceUnit> times(Distance multiplier) {
    return (Mult<AngularAccelerationUnit, DistanceUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, DistanceUnit> divide(Distance divisor) {
    return (Per<AngularAccelerationUnit, DistanceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, EnergyUnit> times(Energy multiplier) {
    return (Mult<AngularAccelerationUnit, EnergyUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, EnergyUnit> divide(Energy divisor) {
    return (Per<AngularAccelerationUnit, EnergyUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, ForceUnit> times(Force multiplier) {
    return (Mult<AngularAccelerationUnit, ForceUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, ForceUnit> divide(Force divisor) {
    return (Per<AngularAccelerationUnit, ForceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, FrequencyUnit> times(Frequency multiplier) {
    return (Mult<AngularAccelerationUnit, FrequencyUnit>) Measure.super.times(multiplier);
  }

  @Override
  default AngularVelocity divide(Frequency divisor) {
    return RadiansPerSecond.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Mult<AngularAccelerationUnit, LinearAccelerationUnit> times(LinearAcceleration multiplier) {
    return (Mult<AngularAccelerationUnit, LinearAccelerationUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, LinearAccelerationUnit> divide(LinearAcceleration divisor) {
    return (Per<AngularAccelerationUnit, LinearAccelerationUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, LinearMomentumUnit> times(LinearMomentum multiplier) {
    return (Mult<AngularAccelerationUnit, LinearMomentumUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, LinearMomentumUnit> divide(LinearMomentum divisor) {
    return (Per<AngularAccelerationUnit, LinearMomentumUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, LinearVelocityUnit> times(LinearVelocity multiplier) {
    return (Mult<AngularAccelerationUnit, LinearVelocityUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, LinearVelocityUnit> divide(LinearVelocity divisor) {
    return (Per<AngularAccelerationUnit, LinearVelocityUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, MassUnit> times(Mass multiplier) {
    return (Mult<AngularAccelerationUnit, MassUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, MassUnit> divide(Mass divisor) {
    return (Per<AngularAccelerationUnit, MassUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, MomentOfInertiaUnit> times(MomentOfInertia multiplier) {
    return (Mult<AngularAccelerationUnit, MomentOfInertiaUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, MomentOfInertiaUnit> divide(MomentOfInertia divisor) {
    return (Per<AngularAccelerationUnit, MomentOfInertiaUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, MultUnit<?, ?>> times(Mult<?, ?> multiplier) {
    return (Mult<AngularAccelerationUnit, MultUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, MultUnit<?, ?>> divide(Mult<?, ?> divisor) {
    return (Per<AngularAccelerationUnit, MultUnit<?, ?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, PerUnit<?, ?>> times(Per<?, ?> multiplier) {
    return (Mult<AngularAccelerationUnit, PerUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, PerUnit<?, ?>> divide(Per<?, ?> divisor) {
    return (Per<AngularAccelerationUnit, PerUnit<?, ?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, PowerUnit> times(Power multiplier) {
    return (Mult<AngularAccelerationUnit, PowerUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, PowerUnit> divide(Power divisor) {
    return (Per<AngularAccelerationUnit, PowerUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, TemperatureUnit> times(Temperature multiplier) {
    return (Mult<AngularAccelerationUnit, TemperatureUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, TemperatureUnit> divide(Temperature divisor) {
    return (Per<AngularAccelerationUnit, TemperatureUnit>) Measure.super.divide(divisor);
  }


  @Override
  default AngularVelocity times(Time multiplier) {
    return RadiansPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Velocity<AngularAccelerationUnit> divide(Time divisor) {
    return VelocityUnit.combine(unit(), divisor.unit()).ofBaseUnits(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Mult<AngularAccelerationUnit, TorqueUnit> times(Torque multiplier) {
    return (Mult<AngularAccelerationUnit, TorqueUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, TorqueUnit> divide(Torque divisor) {
    return (Per<AngularAccelerationUnit, TorqueUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, VelocityUnit<?>> times(Velocity<?> multiplier) {
    return (Mult<AngularAccelerationUnit, VelocityUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, VelocityUnit<?>> divide(Velocity<?> divisor) {
    return (Per<AngularAccelerationUnit, VelocityUnit<?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<AngularAccelerationUnit, VoltageUnit> times(Voltage multiplier) {
    return (Mult<AngularAccelerationUnit, VoltageUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<AngularAccelerationUnit, VoltageUnit> divide(Voltage divisor) {
    return (Per<AngularAccelerationUnit, VoltageUnit>) Measure.super.divide(divisor);
  }

}