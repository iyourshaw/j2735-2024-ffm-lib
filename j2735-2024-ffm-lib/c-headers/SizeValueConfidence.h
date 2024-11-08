/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "SensorDataSharingMessage"
 * 	found in "asn/J3224-SensorDataSharingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_SizeValueConfidence_H_
#define	_SizeValueConfidence_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum SizeValueConfidence {
	SizeValueConfidence_unavailable	= 0,
	SizeValueConfidence_size_100_00	= 1,
	SizeValueConfidence_size_050_00	= 2,
	SizeValueConfidence_size_020_00	= 3,
	SizeValueConfidence_size_010_00	= 4,
	SizeValueConfidence_size_005_00	= 5,
	SizeValueConfidence_size_002_00	= 6,
	SizeValueConfidence_size_001_00	= 7,
	SizeValueConfidence_size_000_50	= 8,
	SizeValueConfidence_size_000_20	= 9,
	SizeValueConfidence_size_000_10	= 10,
	SizeValueConfidence_size_000_05	= 11,
	SizeValueConfidence_size_000_02	= 12,
	SizeValueConfidence_size_000_01	= 13
} e_SizeValueConfidence;

/* SizeValueConfidence */
typedef long	 SizeValueConfidence_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_SizeValueConfidence_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_SizeValueConfidence;
extern const asn_INTEGER_specifics_t asn_SPC_SizeValueConfidence_specs_1;
asn_struct_free_f SizeValueConfidence_free;
asn_struct_print_f SizeValueConfidence_print;
asn_constr_check_f SizeValueConfidence_constraint;
ber_type_decoder_f SizeValueConfidence_decode_ber;
der_type_encoder_f SizeValueConfidence_encode_der;
xer_type_decoder_f SizeValueConfidence_decode_xer;
xer_type_encoder_f SizeValueConfidence_encode_xer;
jer_type_encoder_f SizeValueConfidence_encode_jer;
oer_type_decoder_f SizeValueConfidence_decode_oer;
oer_type_encoder_f SizeValueConfidence_encode_oer;
per_type_decoder_f SizeValueConfidence_decode_uper;
per_type_encoder_f SizeValueConfidence_encode_uper;
per_type_decoder_f SizeValueConfidence_decode_aper;
per_type_encoder_f SizeValueConfidence_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _SizeValueConfidence_H_ */
#include "asn_internal.h"
