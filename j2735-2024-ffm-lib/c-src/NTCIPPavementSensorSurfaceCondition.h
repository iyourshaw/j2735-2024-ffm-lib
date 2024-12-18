/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_NTCIPPavementSensorSurfaceCondition_H_
#define	_NTCIPPavementSensorSurfaceCondition_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum NTCIPPavementSensorSurfaceCondition {
	NTCIPPavementSensorSurfaceCondition_other	= 1,
	NTCIPPavementSensorSurfaceCondition_error	= 2,
	NTCIPPavementSensorSurfaceCondition_dry	= 3,
	NTCIPPavementSensorSurfaceCondition_moist	= 4,
	NTCIPPavementSensorSurfaceCondition_chemicallyMoist	= 5,
	NTCIPPavementSensorSurfaceCondition_wet	= 6,
	NTCIPPavementSensorSurfaceCondition_chemicallyWet	= 7,
	NTCIPPavementSensorSurfaceCondition_standingWater	= 8,
	NTCIPPavementSensorSurfaceCondition_frost	= 9,
	NTCIPPavementSensorSurfaceCondition_slush	= 10,
	NTCIPPavementSensorSurfaceCondition_snow	= 11,
	NTCIPPavementSensorSurfaceCondition_ice	= 12,
	NTCIPPavementSensorSurfaceCondition_noReport	= 13
	/*
	 * Enumeration is extensible
	 */
} e_NTCIPPavementSensorSurfaceCondition;

/* NTCIPPavementSensorSurfaceCondition */
typedef long	 NTCIPPavementSensorSurfaceCondition_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_NTCIPPavementSensorSurfaceCondition_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_NTCIPPavementSensorSurfaceCondition;
extern const asn_INTEGER_specifics_t asn_SPC_NTCIPPavementSensorSurfaceCondition_specs_1;
asn_struct_free_f NTCIPPavementSensorSurfaceCondition_free;
asn_struct_print_f NTCIPPavementSensorSurfaceCondition_print;
asn_constr_check_f NTCIPPavementSensorSurfaceCondition_constraint;
ber_type_decoder_f NTCIPPavementSensorSurfaceCondition_decode_ber;
der_type_encoder_f NTCIPPavementSensorSurfaceCondition_encode_der;
xer_type_decoder_f NTCIPPavementSensorSurfaceCondition_decode_xer;
xer_type_encoder_f NTCIPPavementSensorSurfaceCondition_encode_xer;
jer_type_encoder_f NTCIPPavementSensorSurfaceCondition_encode_jer;
oer_type_decoder_f NTCIPPavementSensorSurfaceCondition_decode_oer;
oer_type_encoder_f NTCIPPavementSensorSurfaceCondition_encode_oer;
per_type_decoder_f NTCIPPavementSensorSurfaceCondition_decode_uper;
per_type_encoder_f NTCIPPavementSensorSurfaceCondition_encode_uper;
per_type_decoder_f NTCIPPavementSensorSurfaceCondition_decode_aper;
per_type_encoder_f NTCIPPavementSensorSurfaceCondition_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _NTCIPPavementSensorSurfaceCondition_H_ */
#include "asn_internal.h"
