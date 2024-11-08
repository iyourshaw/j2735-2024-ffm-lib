/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_GrassType_H_
#define	_GrassType_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum GrassType {
	GrassType_lessThan30Mph	= 0
	/*
	 * Enumeration is extensible
	 */
} e_GrassType;

/* GrassType */
typedef long	 GrassType_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_GrassType_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_GrassType;
extern const asn_INTEGER_specifics_t asn_SPC_GrassType_specs_1;
asn_struct_free_f GrassType_free;
asn_struct_print_f GrassType_print;
asn_constr_check_f GrassType_constraint;
ber_type_decoder_f GrassType_decode_ber;
der_type_encoder_f GrassType_encode_der;
xer_type_decoder_f GrassType_decode_xer;
xer_type_encoder_f GrassType_encode_xer;
jer_type_encoder_f GrassType_encode_jer;
oer_type_decoder_f GrassType_decode_oer;
oer_type_encoder_f GrassType_encode_oer;
per_type_decoder_f GrassType_decode_uper;
per_type_encoder_f GrassType_encode_uper;
per_type_decoder_f GrassType_decode_aper;
per_type_encoder_f GrassType_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _GrassType_H_ */
#include "asn_internal.h"
