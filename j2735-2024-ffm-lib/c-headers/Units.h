/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Units_H_
#define	_Units_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum Units {
	Units_square_feet	= 8705,
	Units_square_meters	= 8706,
	Units_acres	= 8707,
	Units_hectares	= 8708,
	Units_inches	= 8709,
	Units_feet	= 8710,
	Units_mile	= 8711,
	Units_miles	= 8712,
	Units_nautical_miles	= 8713,
	Units_millimeters	= 8714,
	Units_meters	= 8715,
	Units_kilometer	= 8716,
	Units_kilometers	= 8717,
	Units_feet_per_second	= 8718,
	Units_meters_per_second	= 8719,
	Units_mPH	= 8720,
	Units_kPH	= 8721,
	Units_knots	= 8722,
	Units_elevation	= 8766,
	Units_aM	= 8723,
	Units_pM	= 8724,
	Units_holiday	= 8726,
	Units_seconds	= 8727,
	Units_minutes	= 8728,
	Units_hours	= 8729,
	Units_days	= 8730,
	Units_weeks	= 8731,
	Units_months	= 8732,
	Units_other_times	= 8767,
	Units_nSunday	= 8758,
	Units_nMonday	= 8759,
	Units_nTuesday	= 8760,
	Units_nWednesday	= 8761,
	Units_nThursday	= 8762,
	Units_nFriday	= 8763,
	Units_nSaturday	= 8764,
	Units_weekdays	= 8765,
	Units_weekends	= 8725,
	Units_degrees_Angle	= 8733,
	Units_degrees_Celsius	= 8734,
	Units_degrees_Fahrenheit	= 8735,
	Units_grams	= 8736,
	Units_kilograms	= 8737,
	Units_ounces	= 8738,
	Units_pounds	= 8739,
	Units_tons	= 8740,
	Units_fluid_ounces	= 8741,
	Units_gallons	= 8742,
	Units_milliliters	= 8743,
	Units_liters	= 8744,
	Units_kilograms_per_lane_mile	= 8745,
	Units_tons_per_lane_mile	= 8746,
	Units_dollar	= 8747,
	Units_percent	= 8748,
	Units_grade	= 8757,
	Units_time_delimiter	= 8749,
	Units_dollars	= 8750,
	Units_flight_number	= 8751,
	Units_person_people	= 8752,
	Units_response_plan	= 8753,
	Units_placard_type	= 8754,
	Units_placard_number	= 8755,
	Units_fM	= 8756
} e_Units;

/* Units */
typedef long	 Units_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Units;
asn_struct_free_f Units_free;
asn_struct_print_f Units_print;
asn_constr_check_f Units_constraint;
ber_type_decoder_f Units_decode_ber;
der_type_encoder_f Units_encode_der;
xer_type_decoder_f Units_decode_xer;
xer_type_encoder_f Units_encode_xer;
jer_type_encoder_f Units_encode_jer;
oer_type_decoder_f Units_decode_oer;
oer_type_encoder_f Units_encode_oer;
per_type_decoder_f Units_decode_uper;
per_type_encoder_f Units_encode_uper;
per_type_decoder_f Units_decode_aper;
per_type_encoder_f Units_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _Units_H_ */
#include "asn_internal.h"