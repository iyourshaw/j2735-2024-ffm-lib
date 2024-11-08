/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_MobileSituation_H_
#define	_MobileSituation_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum MobileSituation {
	MobileSituation_abnormal_load	= 2049,
	MobileSituation_wide_load	= 2050,
	MobileSituation_long_load	= 2051,
	MobileSituation_slow_vehicle	= 2052,
	MobileSituation_farm_equipment	= 2053,
	MobileSituation_horse_drawn_vehicles	= 2054,
	MobileSituation_overheight_load	= 2055,
	MobileSituation_overweight_load	= 2056,
	MobileSituation_tracked_vehicle	= 2057,
	MobileSituation_vehicle_carrying_hazardous_materials	= 2058,
	MobileSituation_slow_moving_maintenance_vehicle	= 2059,
	MobileSituation_convoy	= 2060,
	MobileSituation_military_convoy	= 2061,
	MobileSituation_refugee_convoy	= 2062,
	MobileSituation_motorcade	= 2063,
	MobileSituation_mobile_situation_repositioning	= 2064,
	MobileSituation_winter_maintenance_vehicles	= 2065,
	MobileSituation_snowplows	= 2066,
	MobileSituation_slow_moving_maintenance_vehicle_warning_cleared	= 2172,
	MobileSituation_exceptional_load_warning_cleared	= 2173,
	MobileSituation_hazardous_load_warning_cleared	= 2174,
	MobileSituation_convoy_cleared	= 2175
} e_MobileSituation;

/* MobileSituation */
typedef long	 MobileSituation_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_MobileSituation_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_MobileSituation;
asn_struct_free_f MobileSituation_free;
asn_struct_print_f MobileSituation_print;
asn_constr_check_f MobileSituation_constraint;
ber_type_decoder_f MobileSituation_decode_ber;
der_type_encoder_f MobileSituation_encode_der;
xer_type_decoder_f MobileSituation_decode_xer;
xer_type_encoder_f MobileSituation_encode_xer;
jer_type_encoder_f MobileSituation_encode_jer;
oer_type_decoder_f MobileSituation_decode_oer;
oer_type_encoder_f MobileSituation_encode_oer;
per_type_decoder_f MobileSituation_decode_uper;
per_type_encoder_f MobileSituation_encode_uper;
per_type_decoder_f MobileSituation_decode_aper;
per_type_encoder_f MobileSituation_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _MobileSituation_H_ */
#include "asn_internal.h"