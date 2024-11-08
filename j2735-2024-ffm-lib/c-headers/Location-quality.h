/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Location_quality_H_
#define	_Location_quality_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum Location_quality {
	Location_quality_loc_qual_bt1m	= 0,
	Location_quality_loc_qual_bt5m	= 1,
	Location_quality_loc_qual_bt12m	= 2,
	Location_quality_loc_qual_bt50m	= 3,
	Location_quality_loc_qual_bt125m	= 4,
	Location_quality_loc_qual_bt500m	= 5,
	Location_quality_loc_qual_bt1250m	= 6,
	Location_quality_loc_qual_unknown	= 7
} e_Location_quality;

/* Location-quality */
typedef long	 Location_quality_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Location_quality;
asn_struct_free_f Location_quality_free;
asn_struct_print_f Location_quality_print;
asn_constr_check_f Location_quality_constraint;
ber_type_decoder_f Location_quality_decode_ber;
der_type_encoder_f Location_quality_encode_der;
xer_type_decoder_f Location_quality_decode_xer;
xer_type_encoder_f Location_quality_encode_xer;
jer_type_encoder_f Location_quality_encode_jer;
oer_type_decoder_f Location_quality_decode_oer;
oer_type_encoder_f Location_quality_encode_oer;
per_type_decoder_f Location_quality_decode_uper;
per_type_encoder_f Location_quality_encode_uper;
per_type_decoder_f Location_quality_decode_aper;
per_type_encoder_f Location_quality_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _Location_quality_H_ */
#include "asn_internal.h"
