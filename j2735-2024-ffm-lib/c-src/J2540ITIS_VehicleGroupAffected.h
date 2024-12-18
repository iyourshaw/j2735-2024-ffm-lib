/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_J2540ITIS_VehicleGroupAffected_H_
#define	_J2540ITIS_VehicleGroupAffected_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum J2540ITIS_VehicleGroupAffected {
	J2540ITIS_VehicleGroupAffected_all_vehicles	= 9217,
	J2540ITIS_VehicleGroupAffected_bicycles	= 9218,
	J2540ITIS_VehicleGroupAffected_motorcycles	= 9219,
	J2540ITIS_VehicleGroupAffected_cars	= 9220,
	J2540ITIS_VehicleGroupAffected_light_vehicles	= 9221,
	J2540ITIS_VehicleGroupAffected_cars_and_light_vehicles	= 9222,
	J2540ITIS_VehicleGroupAffected_cars_with_trailers	= 9223,
	J2540ITIS_VehicleGroupAffected_cars_with_recreational_trailers	= 9224,
	J2540ITIS_VehicleGroupAffected_vehicles_with_trailers	= 9225,
	J2540ITIS_VehicleGroupAffected_heavy_vehicles	= 9226,
	J2540ITIS_VehicleGroupAffected_trucks	= 9227,
	J2540ITIS_VehicleGroupAffected_buses	= 9228,
	J2540ITIS_VehicleGroupAffected_articulated_buses	= 9229,
	J2540ITIS_VehicleGroupAffected_school_buses	= 9230,
	J2540ITIS_VehicleGroupAffected_vehicles_with_semi_trailers	= 9231,
	J2540ITIS_VehicleGroupAffected_vehicles_with_double_trailers	= 9232,
	J2540ITIS_VehicleGroupAffected_high_profile_vehicles	= 9233,
	J2540ITIS_VehicleGroupAffected_wide_vehicles	= 9234,
	J2540ITIS_VehicleGroupAffected_long_vehicles	= 9235,
	J2540ITIS_VehicleGroupAffected_hazardous_loads	= 9236,
	J2540ITIS_VehicleGroupAffected_exceptional_loads	= 9237,
	J2540ITIS_VehicleGroupAffected_abnormal_loads	= 9238,
	J2540ITIS_VehicleGroupAffected_convoys	= 9239,
	J2540ITIS_VehicleGroupAffected_maintenance_vehicles	= 9240,
	J2540ITIS_VehicleGroupAffected_delivery_vehicles	= 9241,
	J2540ITIS_VehicleGroupAffected_vehicles_with_even_numbered_license_plates	= 9242,
	J2540ITIS_VehicleGroupAffected_vehicles_with_odd_numbered_license_plates	= 9243,
	J2540ITIS_VehicleGroupAffected_vehicles_with_parking_permits	= 9244,
	J2540ITIS_VehicleGroupAffected_vehicles_with_catalytic_converters	= 9245,
	J2540ITIS_VehicleGroupAffected_vehicles_without_catalytic_converters	= 9246,
	J2540ITIS_VehicleGroupAffected_gas_powered_vehicles	= 9247,
	J2540ITIS_VehicleGroupAffected_diesel_powered_vehicles	= 9248,
	J2540ITIS_VehicleGroupAffected_lPG_vehicles	= 9249,
	J2540ITIS_VehicleGroupAffected_military_convoys	= 9250,
	J2540ITIS_VehicleGroupAffected_military_vehicles	= 9251,
	J2540ITIS_VehicleGroupAffected_electric_powered_vehicles	= 9252,
	J2540ITIS_VehicleGroupAffected_hybrid_powered_vehicles	= 9253,
	J2540ITIS_VehicleGroupAffected_inherently_low_emission_vehicles	= 9254,
	J2540ITIS_VehicleGroupAffected_commercial_vehicles	= 9255,
	J2540ITIS_VehicleGroupAffected_runaway_vehicles	= 9256,
	J2540ITIS_VehicleGroupAffected_vehicles_with_lugs	= 9257,
	J2540ITIS_VehicleGroupAffected_motor_driven_cycles	= 9258,
	J2540ITIS_VehicleGroupAffected_recreational_vehicles	= 9259,
	J2540ITIS_VehicleGroupAffected_non_motorized_vehicles	= 9260,
	J2540ITIS_VehicleGroupAffected_traffic	= 9261
} e_J2540ITIS_VehicleGroupAffected;

/* J2540ITIS_VehicleGroupAffected */
typedef long	 J2540ITIS_VehicleGroupAffected_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_J2540ITIS_VehicleGroupAffected_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_J2540ITIS_VehicleGroupAffected;
asn_struct_free_f J2540ITIS_VehicleGroupAffected_free;
asn_struct_print_f J2540ITIS_VehicleGroupAffected_print;
asn_constr_check_f J2540ITIS_VehicleGroupAffected_constraint;
ber_type_decoder_f J2540ITIS_VehicleGroupAffected_decode_ber;
der_type_encoder_f J2540ITIS_VehicleGroupAffected_encode_der;
xer_type_decoder_f J2540ITIS_VehicleGroupAffected_decode_xer;
xer_type_encoder_f J2540ITIS_VehicleGroupAffected_encode_xer;
jer_type_encoder_f J2540ITIS_VehicleGroupAffected_encode_jer;
oer_type_decoder_f J2540ITIS_VehicleGroupAffected_decode_oer;
oer_type_encoder_f J2540ITIS_VehicleGroupAffected_encode_oer;
per_type_decoder_f J2540ITIS_VehicleGroupAffected_decode_uper;
per_type_encoder_f J2540ITIS_VehicleGroupAffected_encode_uper;
per_type_decoder_f J2540ITIS_VehicleGroupAffected_decode_aper;
per_type_encoder_f J2540ITIS_VehicleGroupAffected_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _J2540ITIS_VehicleGroupAffected_H_ */
#include "asn_internal.h"
